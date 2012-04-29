package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstatistics.herokuapp.com/players.txt"));
        QueryBuilder query = new QueryBuilder();
 
        Matcher m = query.playsIn("NYR");
        //             .hasAtLeast(10, "goals")
        //             .hasFewerThan(25, "assists").build();
 
    for (Player player : stats.matches(m)) {
        System.out.println( player );
    }
       /*  teht 2 
        Matcher m = new And( new HasAtLeast(15, "goals"),
                             new HasAtLeast(15, "assists"),
                             new PlaysIn("PHI")
        );
        Matcher n = new And( new HasFewerThan(15, "goals"),
                             new HasFewerThan(15, "assists"),
                             new PlaysIn("PHI")
        );
        Matcher p = new And( new Or(10, "goals"),
                             new Or(5, "assists"),
                             new PlaysIn("PHI")
        );
        Matcher r = new And( new Not(28, "goals"),
                             new Not(3, "assists"),
                             new PlaysIn("PHI")
        );
        
        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
        System.out.println("");
         for (Player playerFewer : stats.matches(n)) {
            System.out.println( playerFewer );
        }
        System.out.println("");
        for (Player playerOr : stats.matches(p)) {
           System.out.println( playerOr );
        }
        System.out.println("");
        for (Player playerOr : stats.matches(r)) {
           System.out.println( playerOr );
        }
        * 
        */
    }
}
