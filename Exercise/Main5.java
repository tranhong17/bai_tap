package Exercise;

public class Main5 {
    public static void main(String[] args){
        InvoiceItem5 in1 = new InvoiceItem5("A101", "Pen Red", 888, 0.88);
        System.out.println(in1);

        // get and set
        in1.setQty(999);
        in1.setUnitPrice(0.99);
        System.out.println(in1);
        System.out.println("id is: " + in1.getId());
        System.out.println("desc is: " + in1.getDesc());
        System.out.println("qty is: " + in1.getQty());
        System.out.println("unitPrice is: " + in1.getUnitPrice());

        // test getTotal

        System.out.println("The total is: " + in1.getTotal());
    }
}
