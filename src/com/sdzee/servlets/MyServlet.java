package com.sdzee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Métier.ContactMetierImp;
import Métier.IContactMetier;
import Métier.IUserMetier;
import Métier.Ivoyages;
import Métier.UserMetierImp;
import Métier.contact;
import Métier.envoyerEmail;
import Métier.voyages;
import Métier.voyagesImpl;
import Web.AgenceModel;
import Métier.user;


/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet implements Servlet {
	
	private Ivoyages metier;
	private IUserMetier metier1;
	private IContactMetier metier2;

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// System.out.println("ICI DANS LA SERVLET");
		doPost(request, response);

	}
	
	@Override
	public void init() throws ServletException {
		metier = new voyagesImpl();
		metier1 = new UserMetierImp();
		metier2 = new ContactMetierImp();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		AgenceModel model = new AgenceModel ();
		request.setAttribute("modd", model);
		List<voyages> voy;
		List<contact> mess;
		voy = metier.listeVoyages();
		mess = metier2.listeContactDisplay();
		model.setMessages(mess);
		model.setListeVoyages(voy);
		envoyerEmail send = new envoyerEmail();

		
		if(action.equals("confirmer")) {
			String destination, nom, type, checkin,checkout;
			String moy_trans,dateAdd,comVoy, nomHotel;
			double prix;
			int numAdmin, qteOffre, nAdultes,nEnfants,starsHotel;
			
			destination = request.getParameter("pays");
			nom = request.getParameter("nomVoy");
			type = request.getParameter("type_voy");
			checkin = request.getParameter("check-in-v");
			checkout = request.getParameter("check-out-v");
			moy_trans = request.getParameter("moyTrans");
			prix = Double.parseDouble(request.getParameter("prixVoy"));
			qteOffre = Integer.parseInt(request.getParameter("qteVoy"));
			nAdultes = Integer.parseInt(request.getParameter("nbrAdul"));
			nEnfants = Integer.parseInt(request.getParameter("nbrEnf"));
			nomHotel = request.getParameter("nomHot");
			starsHotel = Integer.parseInt(request.getParameter("nbrEtoi"));
			comVoy = request.getParameter("comm");
			
			voyages v = new voyages();
			v.setDest_voy(destination);
			v.setNom_voy(nom);
			v.setType_voy(type);
			v.setCheck_in_v(checkin);
			v.setCheck_out_v(checkout);
			v.setMoyen_trans(moy_trans);
			v.setPrix_voy(prix);
			v.setQte_offre(qteOffre);
			v.setNbre_adultes(nAdultes);
			v.setNbre_enfants(nEnfants);
			v.setNom_hotel(nomHotel);
			v.setNbre_etoiles_hotel(starsHotel);
			v.setCom_voy(comVoy);
			
			String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

			v.setDate_ajout(date);
			
			v.setNum_admin(1);
			
			metier.addVoyage(v);
			
		}
		else
			if(action.equals("modifierVoy"))
			{
				voy = metier.listeVoyages();
				model.setListeVoyages(voy);
				System.out.println("HEY HEY HEY");
			}
			else
				if(action.equals("modVoyage"))
				{
					int ref1 = Integer.parseInt(request.getParameter("ref1"));
					voyages v = metier.getVoyage(ref1);
					request.setAttribute("num", v.getNum_voy());
					request.setAttribute("dest", v.getDest_voy());
					request.setAttribute("nom", v.getNom_voy());
					request.setAttribute("type", v.getType_voy());
					request.setAttribute("checkin", v.getCheck_in_v());
					request.setAttribute("checkout", v.getCheck_out_v());
					request.setAttribute("moy", v.getMoyen_trans());
					request.setAttribute("prix", v.getPrix_voy());
					request.setAttribute("comm", v.getCom_voy());
					request.setAttribute("qte", v.getQte_offre());
					request.setAttribute("nadults", v.getNbre_adultes());
					request.setAttribute("nenfants", v.getNbre_enfants());
					request.setAttribute("hotel", v.getNom_hotel());
					request.setAttribute("etoiles", v.getNbre_etoiles_hotel());
					request.getRequestDispatcher("modifierVoyageAdmin.jsp").forward(request, response);
				}
				else
					if(action.equals("confModVoy"))
					{
						String destination, nom, type, checkin,checkout;
						String moy_trans,dateAdd,comVoy, nomHotel;
						double prix;
						int numVoy, qteOffre, nAdultes,nEnfants,starsHotel;
						
						destination = request.getParameter("pays");
						nom = request.getParameter("nomVoy");
						type = request.getParameter("type_voy");
						checkin = request.getParameter("check-in-v");
						checkout = request.getParameter("check-out-v");
						moy_trans = request.getParameter("moyTrans");
						prix = Double.parseDouble(request.getParameter("prixVoy"));
						qteOffre = Integer.parseInt(request.getParameter("qteVoy"));
						nAdultes = Integer.parseInt(request.getParameter("nbrAdul"));
						nEnfants = Integer.parseInt(request.getParameter("nbrEnf"));
						nomHotel = request.getParameter("nomHot");
						starsHotel = Integer.parseInt(request.getParameter("nbrEtoi"));
						comVoy = request.getParameter("comm");
						numVoy = Integer.parseInt(request.getParameter("numVoy"));
						
						voyages v = metier.getVoyage(numVoy);
						v.setDest_voy(destination);
						v.setNom_voy(nom);
						v.setType_voy(type);
						v.setCheck_in_v(checkin);
						v.setCheck_out_v(checkout);
						v.setMoyen_trans(moy_trans);
						v.setPrix_voy(prix);
						v.setQte_offre(qteOffre);
						v.setNbre_adultes(nAdultes);
						v.setNbre_enfants(nEnfants);
						v.setNom_hotel(nomHotel);
						v.setNbre_etoiles_hotel(starsHotel);
						v.setCom_voy(comVoy);
						metier.modifierVoyage(v);
						voy = metier.listeVoyages();
						model.setListeVoyages(voy);
						request.getRequestDispatcher("modifierVoyage.jsp").forward(request, response);
						
					}
					else if(action.equals("connexion"))
    				{
    					String username = request.getParameter("email");
    					String mdp = request.getParameter("motdepasse");
    					List<user> lstu = metier1.listeUsers();
    
    					int k = 0;
    					for(user us:lstu)
    					{
    						if(us.getEmail_user().equals(username) && us.getMdp_user().equals(mdp))
    							k++;
    					}
    					String err = "Login ou mot de passe incorrect";
    					if(k == 0)
    					{
    						request.setAttribute("erreur", err);
    						request.getRequestDispatcher("connexion.jsp").forward(request, response); 
    					}
    						
    					else
    						if(k>0)
    						{
    							HttpSession session = request.getSession();
    							session.setAttribute("nom", username);
    							user u = metier1.getUserTwo(username,mdp);
    							model.setUr(u);
    							if(u.getEmail_user().contentEquals("admin@admin.ma"))
    							response.sendRedirect("indexAdmin.jsp");
    							else
    								response.sendRedirect("index.jsp");
    						}

    				}
					else if(action.equals("logout"))
					{

						HttpSession session1=request.getSession();  
			            session1.invalidate();  
			              
			            response.sendRedirect("connexion.jsp");
					}
					else 
						if(action.equals("contactus"))
						{
							String nomc = request.getParameter("nomc");
							String emailc = request.getParameter("emailc");
							String sujetm = request.getParameter("sujetm");
							String message = request.getParameter("message");
							
							contact c = new contact();
							c.setNom_contact(nomc);
							c.setEmail_contact(emailc);
							c.setSujet_contact(sujetm);
							c.setMessage_contact(message);
							metier2.initierContact(c);
							send = new envoyerEmail();
							String msg = "Merci beaucoup pour votre message!\r\n" + 
									"\r\n" + 
									"Ceci est un accusé de réception de votre demande, elle sera traitée bientôt et vous receverez une réponse dans les 48 heures ouvrables après avoir envoyé votre message.\r\n" + 
									"Cordialement,\r\n" + 
									"\r\n" + 
									"MD Travels";
							send.sendEmail(c.getEmail_contact(), msg, "Accusé De Réception");
							request.getRequestDispatcher("index.jsp").forward(request, response);
						}
						else
							if(action.equals("listeContact"))
							{
								mess = metier2.listeContactDisplay();
								model.setMessages(mess);
								request.getRequestDispatcher("consulterMessages.jsp").forward(request, response);
							}
							else
								if(action.equals("replyContactOne"))
								{
			
									int ref1 = Integer.parseInt(request.getParameter("ref1"));
									contact c = metier2.getContact(ref1);
									request.setAttribute("nomc", c.getNom_contact());
									request.setAttribute("emailc",c.getEmail_contact());
									request.setAttribute("sujetc", c.getSujet_contact());
									request.setAttribute("messagec", c.getMessage_contact());
									request.setAttribute("numcon", ref1);
									
								
									request.getRequestDispatcher("reponseClient.jsp").forward(request, response);
								}
								else
									if(action.equals("replyContactTwo"))
									{
										String sujrep = request.getParameter("sujrep");
										String msgrep = request.getParameter("msgrep");
										String emailc = request.getParameter("emailc");
										int numcontact = Integer.parseInt(request.getParameter("numcontact"));
										send = new envoyerEmail();
										send.sendEmail(emailc, msgrep, sujrep);
										contact c = metier2.getContact(numcontact);
										c.setEtat_contact(true);
										metier2.updateContact(c);
										mess = metier2.listeContactDisplay();
										model.setMessages(mess);
										request.getRequestDispatcher("consulterMessages.jsp").forward(request, response);

									}
		
		
		if(action.equals("confirmer")) 
			request.getRequestDispatcher("modifierVoyage.jsp").forward(request, response); 	
		else
			if(action.equals("modifierVoy"))
				request.getRequestDispatcher("modifierVoyage.jsp").forward(request, response);

			
	}
	


}
