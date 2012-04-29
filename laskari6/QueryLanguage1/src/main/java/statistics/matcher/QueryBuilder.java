/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author Kari
 */
public class QueryBuilder {
    private Matcher mat;
    private String seura;
    //private Player player;
 
    public QueryBuilder() {
      //  player = new Player(String name, String team, int goals, int assists);
  //      mat = new Matcher();
    }
    private QueryBuilder(Matcher mat) {
        this.mat=mat;
    }
    //private QueryBuilder(Pino pino,String seura) {
    //    this.pino=pino;
    //    this.seura=seura;
    //}
    
    public QueryBuilder playsIn(String seura) {
      return new QueryBuilder(new PlaysIn(seura));
    }
 //return new Pinorakentaja( new PrepaidPino(pino, krediitit));
 //   public QueryBuilder or(){
  //      return new QueryBuilder(new Or(int value, String category));//) {KryptattuPino(and));
  //  }
 
  //  public QueryBuilder prepaid(int krediitit){
  //      return new QueryBuilder( new PrepaidPino(and, krediitit));
  //  }
 
    //public QueryBuilder loggaava(PrintWriter loki){
    //    return new QueryBuilder( new LokiPino(pino, loki));
   // }
 
    public Matcher mat(){
        return mat;
    } 
    //////////////////////////////////////////
     /*  private Matcher ma;
 
    public QueryBuilder() {
        pino = new Pino();
      //  pino = new Pino();
    }
 
    private QueryBuilder(Pino pino) {
        this.pino = pino;
        this.pino = pino;
    }
 
    public QueryBuilder kryptattu(){
        return new Pinorakentaja( new KryptattuPino(pino));
    }
 
    public QueryBuilder prepaid(int krediitit){
        return new Pinorakentaja( new PrepaidPino(pino, krediitit));
    }
 
    public QueryBuilder loggaava(PrintWriter loki){
        return new QueryBuilder( new LokiPino(pino, loki));
    }
 
    public Pino pino(){
        return pino;
    } */
    /////////////////////////////////////////////
    
}
