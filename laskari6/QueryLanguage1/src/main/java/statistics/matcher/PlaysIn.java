
package statistics.matcher;

import statistics.Player;

public class PlaysIn implements Matcher {
    private String team;

    public PlaysIn(String team) {
        this.team = team;
    }

   // PlaysIn(Pino pino, String seura) {
   //     throw new UnsupportedOperationException("Not yet implemented");
   // }//lisatty teht3
    
    @Override
    public boolean matches(Player p) {
        return p.getTeam().contains(team);
    }
    
}
