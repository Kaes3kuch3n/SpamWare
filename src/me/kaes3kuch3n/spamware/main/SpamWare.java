package me.kaes3kuch3n.spamware.main;

import javax.swing.JOptionPane;

public class SpamWare
{
  static int newOptionPane()
  {
    Object[] options = { "Erneut versuchen", "Abbrechen" };
    return JOptionPane.showOptionDialog(null, "Das Programm konnte nicht richtig ausgeführt werden.", "Error", 
      -1, 0, null, options, options[0]);
  }
  
  public static void main(String[] args)
  {
    int state = newOptionPane();
    while (state != -10) {
      state = newOptionPane();
    }
  }
}
