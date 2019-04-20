/*
 * Mohit Patel
 * Student ID : 991520482
 * SYST10199 - Web Programming
 */

/**
 *
 * @author Mohit
 */
import java.util.ArrayList;
import java.util.List;

public class Players {
 
 List<String> players = new ArrayList<>();
 
 public Players() {
  super();
 }

 public void addPlayers(String name) {
  players.add(name);
 }
     
 public List<String> getPlayers() {
  return players;
 }
}