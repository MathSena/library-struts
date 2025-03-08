package com.mathsena.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ImageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtém o nome da imagem via parâmetro "image"
		String imageName = request.getParameter("image");
		if (imageName == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}

		// Se o nome da imagem começa com "images/", remova esse prefixo
		if (imageName.startsWith("images/")) {
			imageName = imageName.substring("images/".length());
		}

		ServletContext context = getServletContext();
		// Abre o arquivo da imagem no diretório WEB-INF/images
		InputStream is = context.getResourceAsStream("/WEB-INF/images/" + imageName);
		if (is == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		// Define o tipo MIME de acordo com a extensão do arquivo
		String mimeType = context.getMimeType(imageName);
		if (mimeType == null) {
			mimeType = "application/octet-stream";
		}
		response.setContentType(mimeType);
		// Envia o conteúdo da imagem para a resposta
		OutputStream os = response.getOutputStream();
		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = is.read(buffer)) != -1) {
			os.write(buffer, 0, bytesRead);
		}
		is.close();
		os.flush();
	}
}
