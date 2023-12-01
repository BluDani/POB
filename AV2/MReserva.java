import java.util.ArrayList;
import java.util.Scanner;

public class MReserva{

  public void processamento(ArrayList<Reserva> reservas){

    Scanner sc = new Scanner(System.in);
    int res;

    do{

      System.out.println("\n=====Menu Reservas=====");
      System.out.println("0 - Sair");
      System.out.println("1 - Incluir");
      System.out.println("2 - Excluir");
      System.out.println("3 - Alterar");
      System.out.println("4 - Listar");
      System.out.println("=======================");

      System.out.println("Digite a opção desejada: ");
      res = sc.nextInt();

      switch(res){
          case 0:
            System.out.println("Saindo do sistema...");
            break;

          case 1:
            incluir(reservas);
            break;

          case 2:
            excluir(reservas);
            break;

          case 3:
            alterar(reservas);
            break;

          case 4:
            listar(reservas);
            break;
      }
    }
    while(res != 0);
  }

  public boolean incluir(ArrayList<Reserva> reservas){

    Scanner sc = new Scanner(System.in);

    System.out.println("ID: ");
    int id = sc.nextInt();
    
    System.out.println("ID Quarto: ");
    int idQuarto = sc.nextInt();

    System.out.println("ID Cama: ");
    int idCama = sc.nextInt();

    System.out.println("ID Cliente: ");
    int idCliente = sc.nextInt();
    sc.nextLine();

    System.out.println("Data Entrada: ");
    String dataEntrada = sc.next();
    sc.nextLine();

    System.out.println("Data Saida: ");
    String dataSaida = sc.next();

    Reserva reserva = new Reserva(id, idQuarto, idCama, idCliente, dataEntrada, dataSaida);

    reservas.add(reserva);

    return true;
  }

  public boolean excluir(ArrayList<Reserva> reservas){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o ID: ");
    int id = sc.nextInt();

    for(Reserva i : reservas){

      if(id == i.getId()){
        
        reservas.remove(i);
        return true;
      }
    }
    
    return false;
  }

  public boolean alterar(ArrayList<Reserva> reservas){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for(Reserva i : reservas){

      if(id == i.getId()){

        System.out.println("ID Quarto: ");
        int idQuarto = sc.nextInt();

        System.out.println("ID Cama: ");
        int idCama = sc.nextInt();

        System.out.println("ID Cliente: ");
        int idCliente = sc.nextInt();
        sc.nextLine();

        System.out.println("Data Entrada: ");
        String dataEntrada = sc.next();
        sc.nextLine();

        System.out.println("Data Saida: ");
        String dataSaida = sc.next();

        i.setIdQuarto(idQuarto);
        i.setIdCama(idCama);
        i.setIdCliente(idCliente);
        i.setDataEntrada(dataEntrada);
        i.setDataSaida(dataSaida);

        return true;
      }
    }

    return false;
  }

  public void listar(ArrayList<Reserva> reservas){

    System.out.println("\n=====Lista de Reservas=====");

    for(Reserva i : reservas){

      System.out.println("ID: " + i.getId());
      System.out.println("ID Quarto: " + i.getIdQuarto());
      System.out.println("ID Cama: " + i.getIdCama());
      System.out.println("ID Cliente: " + i.getIdCliente());
      System.out.println("Data Entrada: " + i.getDataEntrada());
      System.out.println("Data Saida: " + i.getDataSaida());

      System.out.println("\n\n");
    }

    System.out.println("===========================");
  }
}
