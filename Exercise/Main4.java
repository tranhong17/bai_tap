package Exercise;

public class Main4 {
    public static void main(String[] args){
        NhanVien4 nv1 = new NhanVien4(8, "Petter", "Tân", 2500);
        System.out.println(nv1);

        nv1.setSalary(999);
        System.out.println(nv1);
        System.out.println("id is: " + nv1.getId());
        System.out.println("firsname is: " + nv1.getFirstName());
        System.out.println("lastname is: " + nv1.getLastName());
        System.out.println("salary is: " + nv1.getSalary());

        System.out.println("name is: " + nv1.getName());
        System.out.println("annual sallary is: " + nv1.getAnnualSalary());

        System.out.println(nv1.raiseSalary(10));
        System.out.println(nv1);

    }

}
