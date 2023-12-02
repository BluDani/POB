import java.util.ArrayList;
import java.util.Scanner;

public class Cama{

  private int id;
  private int codigoCama;
  private boolean ehBeliche;
  private String posicao;
  private String descricao;

  public Cama(int id, int codigoCama, boolean ehBeliche, String posicao, String descricao){

    super();
    
    this.id = id;
    this.codigoCama = codigoCama;
    this.ehBeliche = ehBeliche;
    this.posicao = posicao;
    this.descricao = descricao;
  }

  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }

  public int getCodigoCama(){
    return codigoCama;
  }
  public void setCodigoCama(int codigoCama){
    this.codigoCama = codigoCama;
  }

  public boolean getEhBeliche(){
    return ehBeliche;
  }
  public void setEhBeliche(boolean ehBeliche){
    this.ehBeliche = ehBeliche;
  }

  public String getPosicao(){
    return posicao;
  }
  public void setPosicao(String posicao){
    this.posicao = posicao;
  }

  public String getDescricao(){
    return descricao;
  }
  public void setDescricao(String descricao){
    this.descricao = descricao;
  }
}
