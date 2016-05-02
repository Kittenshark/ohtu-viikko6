package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));
         /* 
        Matcher m = new And( new HasAtLeast(10, "goals"),
                             new HasAtLeast(10, "assists"),
                             new PlaysIn("PHI")
        );
        
        Matcher m = new Or( new HasFewerThan(5, "goals"),
                            new HasAtLeast(25, "goals"));
        
        Matcher m = new Not( new HasFewerThan(5, "goals"),
                            new HasAtLeast(10, "goals"));
        */
        QueryBuilder query = new QueryBuilder();
        /*
        Matcher m = query.playsIn("NYR")
                .hasAtLeast(20, "goals")
                .hasFewerThan(25, "assists").build();
        
        Matcher m2 = query.playsIn("EDM")
                .hasAtLeast(20, "goals").build();
        
        Matcher m3 = query.oneOf(m2, m).build();
*/
        Matcher m = query.oneOf(
                                query.playsIn("PHI").hasAtLeast(50, "points").build(),
                
                                query.playsIn("EDM").hasAtLeast(50, "points").build()).build();
         
        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
    }
}
