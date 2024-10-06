package Memoria_Vetores.Entidades;

public class Quartos {
  private int room;
  private String name;
  private String email;

  public Quartos(int room, String name, String email) {
    this.room = room;
    this.name = name;
    this.email = email;
  }

  public int getRoom() {
    return room;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}