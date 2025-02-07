package holamundo.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet que procesa un formulario y muestra un mensaje de bienvenida.
 */
@WebServlet(name = "Servlet", urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {

    /**
     * Procesa las solicitudes POST enviadas desde el formulario.
     *
     * @param request  El objeto HttpServletRequest que contiene los datos del formulario.
     * @param response El objeto HttpServletResponse para enviar la respuesta al cliente.
     * @throws ServletException si ocurre un error en el Servlet.
     * @throws IOException      si ocurre un error de entrada/salida.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Configurar el tipo de respuesta en HTML y el juego de caracteres
        response.setContentType("text/html;charset=UTF-8");

        // Obtener el valor del parámetro 'nombre' enviado desde el formulario
        String nombre = request.getParameter("nombre");

        // Generar la respuesta HTML
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Bienvenida</title>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>¡Bienvenido, " + nombre + "!</h1>");
            out.println("<p>Gracias por visitar nuestro sitio.</p>");
            out.println("<a href='index.html'>Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Proporciona una breve descripción del servlet.
     *
     * @return Una cadena que describe al servlet.
     */
    @Override
    public String getServletInfo() {
        return "Servlet que muestra un mensaje de bienvenida basado en el nombre proporcionado.";
    }
}
