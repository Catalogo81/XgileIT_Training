import java.util.Comparator;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {

        if(o1.score == o2.score)
        {
            return o2.name.compareTo(o1.name);
        }

        //if o1.score is greater than o2.score it returns -1,
        // else if condition is false it will return a 1
        int answer;
        if(o1.score > o2.score)
        {
            answer = -1;
        }
        else
        {
            answer = 1;
        }

        return answer;
    }

//    Comparator<Player> descOrder = new Comparator<Player>() {
//        @Override
//        public int compare(Player o1, Player o2) {
//
//            if(o1.score == o2.score)
//            {
//                return o2.name.compareTo(o1.name);
//            }
//
//            //if o1.score is greater than o2.score it returns -1,
//            // else if condition is false it will return a 1
//            int answer;
//            if(o1.score > o2.score)
//            {
//                answer = -1;
//            }
//            else
//            {
//                answer = 1;
//            }
//
//            return answer;
//        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public Comparator<Player> reversed() {
            return Comparator.super.reversed();
        }
    }
