package orientacaoObjeto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/teste")

public class TestarCanil extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Palatavel p = new Cachorro();
		Alimento a =new Alimento();
		a.setAmargo(false);
		a.setAzedo(false);
		
		GrauSatisfacao sCachorro = p.comer(a);
		
		Palatavel g = new Gato();
		a.setAmargo(true);
		a.setAzedo(false);
		GrauSatisfacao sGato = p.comer(a);
		g.comer(a);
		
		List lista = new ArrayList();
		
	
		
		for (int i = 0; i < 20; i++) {
			lista.add(sCachorro);
			lista.add(sGato);			
		}
		
		
		req.setAttribute("resposta", lista);
		req.setAttribute("t1", req.getParameter("nome"));
		req.setAttribute("t2", req.getParameter("sobrenome"));
		
		
		RequestDispatcher dispacher = req.getRequestDispatcher("index.jsp");
		dispacher.forward(req, resp);
	}
	
}