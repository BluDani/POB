import java.util.ArrayList;
import java.util.Scanner;

public class Reserva{

  private int id;
  private int idQuarto;
  private int idCama;
  private int idCliente;
  private String dataEntrada;
  private String dataSaida;

  public Reserva(int id, int idQuarto, int idCama, int idCliente, String dataEntrada, String dataSaida){

    super();
    
    this.id = id;
    this.idQuarto = idQuarto;
    this.idCama = idCama;
    this.idCliente = idCliente;
    this.dataEntrada = dataEntrada;
    this.dataSaida = dataSaida;
  }

  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }

  public int getIdQuarto(){
    return idQuarto;
  }
  public void setIdQuarto(int idQuarto){
    this.idQuarto = idQuarto;
  }

  public int getIdCama(){
    return idCama;
  }
  public void setIdCama(int idCama){
    this.idCama = idCama;
  }

  public int getIdCliente(){
    return idCliente;
  }
  public void setIdCliente(int idCliente){
    this.idCliente = idCliente;
  }

  public String getDataEntrada(){
    return dataEntrada;
  }
  public void setDataEntrada(String dataEntrada){
    this.dataEntrada = dataEntrada;
  }

  public String getDataSaida(){
    return dataSaida;
  }
  public void setDataSaida(String dataSaida){
    this.dataSaida = dataSaida;
  }
}
