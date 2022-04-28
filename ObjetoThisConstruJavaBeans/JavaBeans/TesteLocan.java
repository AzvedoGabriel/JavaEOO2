package JavaBeans;

public class TesteLocan {

    public static void main(String[] args) {

        LocalBean local = new LocalBean();

        local.setNome("Salvador");
        local.setAno(466);

        System.out.print(local.getNome() + " tem " + local.getAno() + " anos.");
    }
}
