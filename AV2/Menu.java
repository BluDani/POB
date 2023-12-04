import java.util.ArrayList;
import java.util.Scanner;

public class Menu{

  private ArrayList<Cliente> clientes = new ArrayList();
  private ArrayList<Reserva> reservas = new ArrayList();
  private ArrayList<Quarto> quartos = new ArrayList();
  private ArrayList<Cama> camas = new ArrayList();

  MCliente mCliente = new MCliente();
  MReserva mReserva = new MReserva();
  MQuarto mQuarto = new MQuarto();
  MCama mCama = new MCama();

  public void processamento(){

    Scanner sc = new Scanner(System.in);

    int opcao;

    do{
      
      System.out.println("\n\n======Menu======");
      System.out.println("0 - Sair");
      System.out.println("1 - Cliente");
      System.out.println("2 - Reserva");
      System.out.println("3 - Quarto");
      System.out.println("4 - Cama");
      System.out.println("================");

      System.out.println("\nDigite a opção desejada: ");
      opcao = sc.nextInt();

      switch(opcao){
          case 0:
            System.out.println("Saindo do sistema...");
            break;
          
          case 1:
            mCliente.processamento(clientes);
            break;

          case 2:
            mReserva.processamento(reservas);
            break;

          case 3:
            mQuarto.processamento(quartos);
            break;

          case 4:
            mCama.processamento(camas);
            break;
      }
    }
    while(opcao != 0);
  }
}
