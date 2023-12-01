import java.util.ArrayList;
import java.util.Scanner;

public class MCliente{

  public void processamento(ArrayList<Cliente> clientes){

    Scanner sc = new Scanner(System.in);
    int res;

    do{

      System.out.println("\n=====Menu Cliente=====");
      System.out.println("0 - Sair");
      System.out.println("1 - Incluir");
      System.out.println("2 - Excluir");
      System.out.println("3 - Alterar");
      System.out.println("4 - Listar");
      System.out.println("======================");

      System.out.println("Digite a opção desejada: ");
      res = sc.nextInt();

      switch(res){
          case 0:
            System.out.println("Saindo do sistema...");
            break;
          
          case 1:
            incluir(clientes);
            break;

          case 2:
            excluir(clientes);
            break;

          case 3:
            alterar(clientes);
            break;

          case 4:
            listar(clientes);
            break;
      }
    }
    while(res != 0);
  }

  public boolean incluir(ArrayList<Cliente> clientes){

    Scanner sc = new Scanner(System.in);

    System.out.println("ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.println("Nome: ");
    String nome = sc.nextLine();
    sc.nextLine();

    System.out.println("Endereço: ");
    String endereco = sc.nextLine();
    sc.nextLine();

    System.out.println("Postal Code: ");
    String postalCode = sc.nextLine();
    sc.nextLine();

    System.out.println("País: ");
    String pais = sc.nextLine();
    sc.nextLine();

    System.out.println("CPF: ");
    String cpf = sc.nextLine();
    sc.nextLine();

    System.out.println("Passaporte: ");
    String passaporte = sc.nextLine();
    sc.nextLine();

    System.out.println("Email: ");
    String email = sc.nextLine();
    sc.nextLine();

    System.out.println("Data de Nascimento: ");
    String dataNascimento = sc.nextLine();

    Cliente cliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);

    clientes.add(cliente);

    return true;
  }

  public boolean excluir(ArrayList<Cliente> clientes){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o ID: ");
    int id = sc.nextInt();

    for(Cliente i : clientes){

      if(id == i.getId()){
        
        clientes.remove(i);
        return true;
      }
    }

    return false;
  }

  public boolean alterar(ArrayList<Cliente> clientes){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for(Cliente i : clientes){

      if(id == i.getId()){

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        sc.nextLine();

        System.out.println("Endereço: ");
        String endereco = sc.nextLine();
        sc.nextLine();

        System.out.println("Postal Code: ");
        String postalCode = sc.nextLine();
        sc.nextLine();

        System.out.println("País: ");
        String pais = sc.nextLine();
        sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        sc.nextLine();

        System.out.println("Passaporte: ");
        String passaporte = sc.nextLine();
        sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();
        sc.nextLine();

        System.out.println("Data de Nascimento: ");
        String dataNascimento = sc.nextLine();

        i.setNome(nome);
        i.setEndereco(endereco);
        i.setPostalCode(postalCode);
        i.setPais(pais);
        i.setCpf(cpf);
        i.setPassaporte(passaporte);
        i.setEmail(email);
        i.setDataNascimento(dataNascimento);

        return true;
      }
    }

    return false;
  }

  public void listar(ArrayList<Cliente> clientes){

    System.out.println("\n=====Lista de Clientes=====");

    for(Cliente i : clientes){

      System.out.println("ID: " + i.getId());
      System.out.println("Nome: " + i.getNome());
      System.out.println("Endereço: " + i.getEndereco());
      System.out.println("Postal Code: " + i.getPostalCode());
      System.out.println("País: " + i.getPais());
      System.out.println("CPF: " + i.getCpf());
      System.out.println("Passaporte: " + i.getPassaporte());
      System.out.println("Email: " + i.getEmail());
      System.out.println("Data de Nascimento: " + i.getDataNascimento());

      System.out.println("\n\n");
    }

    System.out.println("============================");
  }
}
