package a_Zadania.a_Dzien_2.c_Relacje_1_1;


public class Main4 {
    public String query1 = "SELECT t.id, t.quantity, t.price, t.paid FROM tickets AS t JOIN payments AS p ON t.id=p.id WHERE t.paid = 1 AND p.type = 'cash'";
    public String query2 = "SELECT t.id, t.quantity, t.price, t.paid FROM tickets AS t JOIN payments AS p ON t.id=p.id WHERE t.paid = 1 AND p.type = 'transfer'";
    public String query3 = "SELECT t.id, t.quantity, t.price, t.paid FROM tickets AS t JOIN payments AS p ON t.id=p.id WHERE t.paid = 1 AND p.type = 'card'";
    public String query4 = "SELECT t.id, t.quantity, t.price, t.paid FROM tickets AS t JOIN payments AS p ON t.id=p.id WHERE t.paid = 0";

}
