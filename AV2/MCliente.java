import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

      System.out.println("\nDigite a opção desejada: ");
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

    int id = 0;
    String nome = "";
    String endereco = "";
    String postalCode = "";
    String pais = "";
    String cpf = "";
    String passaporte = "";
    String email = "";
    String dataNascimento = "";
    boolean validar = false;

    Scanner sc = new Scanner(System.in);

    while(!validar){

      System.out.println("\nID: ");
      id = sc.nextInt();
      sc.nextLine();

      validar = validaId(id);
    }

    validar = false;

    while(!validar){

      System.out.println("\nNome: ");
      nome = sc.nextLine();

      validar = validaNome(nome);
    }

    validar = false;

    while(!validar){

      System.out.println("\nEndereço: ");
      endereco = sc.nextLine();

      validar = validaEndereco(endereco);
    }

    validar = false;

    while(!validar){

      System.out.println("\nPostal Code: ");
      postalCode = sc.nextLine();

      validar = validaPostalCode(postalCode);
    }
    
    validar = false;

    while(!validar){
      
      System.out.println("\nPaís: ");
      pais = sc.nextLine();

      validar = validaPais(pais);
    }
    
    validar = false;

    while(!validar){

      System.out.println("\nCPF: ");
      cpf = sc.nextLine();

      validar = validaCpf(cpf);
    }
    
    validar = false;

    while(!validar){

      System.out.println("\nPassaporte: ");
      passaporte = sc.nextLine();

      validar = validaPassaporte(passaporte);
    }
    
    validar = false;

    while(!validar){

      System.out.println("\nEmail: ");
      email = sc.nextLine();

      validar = validaEmail(email);
    }
    
    validar = false;

    while(!validar){
      
      System.out.println("\nData de Nascimento: ");
      dataNascimento = sc.nextLine();

      validar = validaDataNascimento(dataNascimento);
    }
    

    Cliente cliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);

    clientes.add(cliente);

    return true;
  }

  public boolean excluir(ArrayList<Cliente> clientes){

    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();

    for(Cliente i : clientes){

      if(id == i.getId()){
        
        clientes.remove(i);
        return true;
      }
    }

    System.out.println("\nCliente não encontrado!");
    return false;
  }

  public boolean alterar(ArrayList<Cliente> clientes){

    String nome = "";
    String endereco = "";
    String postalCode = "";
    String pais = "";
    String cpf = "";
    String passaporte = "";
    String email = "";
    String dataNascimento = "";
    boolean validar = false;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for(Cliente i : clientes){

      if(id == i.getId()){

        while(!validar){

          System.out.println("\nNome: ");
          nome = sc.nextLine();

          validar = validaNome(nome);
        }

        validar = false;

        while(!validar){

          System.out.println("\nEndereço: ");
          endereco = sc.nextLine();

          validar = validaEndereco(endereco);
        }

        validar = false;

        while(!validar){

          System.out.println("\nPostal Code: ");
          postalCode = sc.nextLine();

          validar = validaPostalCode(postalCode);
        }

        validar = false;

        while(!validar){

          System.out.println("\nPaís: ");
          pais = sc.nextLine();

          validar = validaPais(pais);
        }

        validar = false;

        while(!validar){

          System.out.println("\nCPF: ");
          cpf = sc.nextLine();

          validar = validaCpf(cpf);
        }

        validar = false;

        while(!validar){

          System.out.println("\nPassaporte: ");
          passaporte = sc.nextLine();

          validar = validaPassaporte(passaporte);
        }

        validar = false;

        while(!validar){

          System.out.println("\nEmail: ");
          email = sc.nextLine();

          validar = validaEmail(email);
        }

        validar = false;

        while(!validar){

          System.out.println("\nData de Nascimento: ");
          dataNascimento = sc.nextLine();

          validar = validaDataNascimento(dataNascimento);
        }

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

    System.out.println("\nCliente não encontrado!");
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

  public boolean validaId(int id){

    if(id > 0){

      return true;
    }
    else{

      System.out.println("\nID inválido");
      return false;
    }
  }

  //Revisar
  public boolean validaNome(String nome){

    Pattern pattern = Pattern.compile("^[a-z]+[\\s][a-z]+$", Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher(nome);
      boolean matchFound = matcher.find();

      if(!matchFound){

        System.out.println("Nome inválido");
      }

     return matchFound;
  }

  //revisar
  public boolean validaEndereco(String endereco){
    
    Pattern pattern = Pattern.compile("^[a-zA-Z]+$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(endereco);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("Endereço inválido");
    }

    return matchFound;
  }

  public boolean validaPostalCode(String postalCode){

    Pattern pattern = Pattern.compile("^[0-9]{2}.[0-9]{3}-[0-9]{3}+$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(postalCode);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("Postal Code inválido");
    }

    return matchFound;
  }

  public boolean validaPais(String pais){

    Pattern pattern = Pattern.compile("^[a-zA-Z]+$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(pais);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("País inválido");
    }

    return matchFound;
  }

  public boolean validaCpf(String cpf){

    Pattern pattern = Pattern.compile("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(cpf);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("CPF inválido");
    }

    return matchFound;
  }

  public boolean validaPassaporte(String passaporte){

    Pattern pattern = Pattern.compile("^[0-9]{2}.[0-9]{3}.[0-9]{3}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(passaporte);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("Passaporte inválido");
    }

    return matchFound;
  }

  public boolean validaEmail(String email){

    Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("Email inválido");
    }

    return matchFound;
  }

  public boolean validaDataNascimento(String dataNascimento){

    Pattern pattern = Pattern.compile("^[0-3][0-9]/[0-1][1-9]/[0-9]{4}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(dataNascimento);
    boolean matchFound = matcher.find();

    if(!matchFound){

      System.out.println("Data de Nascimento inválida");
    }

    return matchFound;
  }
}
