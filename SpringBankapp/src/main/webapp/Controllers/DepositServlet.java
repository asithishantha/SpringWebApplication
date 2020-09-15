package main.webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class DepositServlet {


    @RequestMapping("/deposit")
    protected void deposit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amount = request.getParameter("amount");
        String deposited = request.getParameter("deposited");


        int intamount=Integer.parseInt(amount);
        int intdeposited=Integer.parseInt(deposited);


        PrintWriter out = response.getWriter();



        double balance= deposit(intamount, intdeposited);
            out.println("<html>");
            out.println("<head>");
            out.println(" <style>");

            out.println(".container {");
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



            out.println("</head>");
            out.println("<body>>");
            out.println("<div class=\"container\">");


            out.println("<h1><b>successfully deposited!!!</b></h1>");

            out.println("<h1><b>your current balance is "+ balance+ "</b></h1>");

        out.println("<button onclick=\"myFunction3()\">withdraw again</button>\n");

        out.println("<script>");
        out.println("function myFunction3() {");
        out.println(" location.replace(\"http://localhost:8080/SpringBankapp_war/withdraw.jsp\")");
        out.println("}");
        out.println("</script>");

        out.println("<button onclick=\"myFunction4()\">deposit again</button>\n");

        out.println("<script>");
        out.println("function myFunction4() {");
        out.println(" location.replace(\"http://localhost:8080/SpringBankapp_war/depositamount.jsp\")");
        out.println("}");
        out.println("</script>");

        out.println("</div>");
            out.println("</body>");

            out.println("</html>");


    }

    public double deposit(double intamount, double intdeposited) {
        double balance= intamount + intdeposited;

        return balance;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
