package edu.ufp.inf.lp2.exjul2018;

import java.util.Date;
import java.util.Vector;

public class Team implements TeamManagementl {

  public String name;

    /**
   * 
   * @element-type GameCall
   */
  public Vector  myGameCall;
    /**
   * 
   * @element-type Player
   */
  public Vector  players;

  public GameCall createGame(Date d, Team visitingTeam) {
  return null;
  }

  public void addGame(GameCall gc) {
  }

  public GameCall findGameCall(Date d) {
  return null;
  }

  public Player[] findPlayerPosition(String position) {
  return null;
  }

  public Player findPlayerWithMoreGoals() {
  return null;
  }

  public Player findPlayer(int number) {
  return null;
  }

  @Override
  public void hirePlayer(Player p) {

  }

  @Override
  public Player sellPlayer(int number) {
    return null;
  }

  @Override
  public void newOperation() {

  }
}