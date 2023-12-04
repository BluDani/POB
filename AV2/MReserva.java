import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

      System.out.println("\nDigite a opção desejada: ");
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
    //id, idQuarto, idCama, idCliente,dataEntrada, dataSaida.
    int id = 0;
    int idQuarto = 0;
    int idCama = 0;
    int idCliente = 0;
    String dataEntrada = "";
    String dataSaida = "";
    boolean validar = false;

    Scanner sc = new Scanner(System.in);

    while(!validar){
      
      System.out.println("\nID: ");
      id = sc.nextInt();

      validar = validaId(id);
    }

    validar = false;

    while(!validar){

      System.out.println("\nID Quarto: ");
      idQuarto = sc.nextInt();

      validar = validaId(idQuarto);
    }

    validar = false;

    while(!validar){

      System.out.println("\nID Cama: ");
      idCama = sc.nextInt();

      validar = validaId(idCama);
    }

    validar = false;

    while(!validar){

      System.out.println("\nID Cliente: ");
      idCliente = sc.nextInt();
      sc.nextLine();

      validar = validaId(idCliente);
    }

    validar = false;

    while(!validar){

      System.out.println("\nData Entrada: ");
      dataEntrada = sc.next();
      sc.nextLine();

      validaData(dataEntrada);
    }

    validar = false;

    while(!validar){

      System.out.println("\nData Saida: ");
      dataSaida = sc.next();

      validaData(dataSaida);
    }
    
    Reserva reserva = new Reserva(id, idQuarto, idCama, idCliente, dataEntrada, dataSaida);

    reservas.add(reserva);

    return true;
  }

  public boolean excluir(ArrayList<Reserva> reservas){

    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();

    for(Reserva i : reservas){

      if(id == i.getId()){
        
        reservas.remove(i);
        return true;
      }
    }

    System.out.println("\nReserva não encontrada");
    return false;
  }

  public boolean alterar(ArrayList<Reserva> reservas){

    int idQuarto = 0;
    int idCama = 0;
    int idCliente = 0;
    String dataEntrada = "";
    String dataSaida = "";
    boolean validar = false;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for(Reserva i : reservas){

      if(id == i.getId()){

        while(!validar){

          System.out.println("\nID Quarto: ");
          idQuarto = sc.nextInt();

          validar = validaId(idQuarto);
        }

        validar = false;

        while(!validar){

          System.out.println("\nID Cama: ");
          idCama = sc.nextInt();

          validar = validaId(idCama);
        }

        validar = false;

        while(!validar){

          System.out.println("\nID Cliente: ");
          idCliente = sc.nextInt();
          sc.nextLine();

          validar = validaId(idCliente);
        }

        validar = false;

        while(!validar){

          System.out.println("\nData Entrada: ");
          dataEntrada = sc.next();
          sc.nextLine();

          validaData(dataEntrada);
        }

        validar = false;

        while(!validar){

          System.out.println("\nData Saida: ");
          dataSaida = sc.next();

          validaData(dataSaida);
        }

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

  public boolean validaId(int id){

    if(id > 0){

      return true;
    }
    else{

      System.out.println("\nID inválido");
      return false;
    }
  }

  public boolean validaData(String data){

    Pattern pattern = Pattern.compile("^[0-3][0-9]/[0-1][1-9]/[0-9]{4}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(data);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("\nData inválida");
    }

    return matchFound;
  }
}
