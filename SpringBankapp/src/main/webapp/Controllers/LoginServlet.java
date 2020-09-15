package main.webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginServlet {

    @RequestMapping("/login")
    public void Login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username = request.getParameter("Username");
        String AccountNumber = request.getParameter("AccountNumber");
        String BankAmount = request.getParameter("BankAmount");


        PrintWriter out = response.getWriter();


        String title = "======!!!your information !!!======";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<div class=\"container\"><h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b> User name</b>: "
                + request.getParameter("Username") + "\n" +
                "  <li><b>Account Number</b>: "
                + request.getParameter("AccountNumber") + "\n" +
                "  <li><b>Bank Amount</b>: "
                + request.getParameter("BankAmount") + "\n" +
                "</ul>\n");
        out.println("</div></body>" +
                "</html>");

        ModelAndView mv= new ModelAndView();





        out.println("<button onclick=\"myFunction1()\">withdraw money</button>\n");

        out.println("<script>");
        out.println("function myFunction1() {");
        out.println("location.replace(\"http://localhost:8080/SpringBankapp_war/withdraw.jsp\")");
        out.println("}");
        out.println("</script>");

        out.println("<button onclick=\"myFunction2()\">deposit money</button>\n");

        out.println("<script>");
        out.println("function myFunction2() {");
        out.println(" location.replace(\"http://localhost:8080/SpringBankapp_war/depositamount.jsp\")");
        out.println("}");
        out.println("</script>");


        out.println("<style>");

        out.println(" .container {");
        out.println(" position: center;");

        out.println("  margin: 20px;");
        out.println("  max-width: 1400px;");
        out.println("   padding: 16px;");
        out.println("background-color: grey;");
        out.println("  }");

        out.println(" body {");
        out.println("    background-image: url('back.jpg');");
        out.println("   text-align: center;");
        out.println("  }");
        out.println("   </style>");

//        mv.setViewName("depositamount.jsp");
//        mv.setViewName("withdraw.jsp");
//        mv.addObject("BankAmount", BankAmount);
//        mv.addObject("BankAmount", BankAmount);
//        return mv;
    }
}
