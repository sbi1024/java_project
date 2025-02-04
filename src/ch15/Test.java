package ch15;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Board> list = new ArrayList<>();
//
//        list.add(new Board("제목1", "내용1", "작성자1"));
//        list.add(new Board("제목2", "내용2", "작성자2"));
//        list.add(new Board("제목3", "내용3", "작성자3"));
//        list.add(new Board("제목4", "내용4", "작성자4"));
//
//
//        System.out.println(list); // Board 의 toString() 재정의
//        System.out.println(list.size());
//        System.out.println(list.get(2));
//
//        Board board = new Board("제목5", "내용5", "작성자5");
//        list.add(board);
//        System.out.println(list.size());
//        list.add(board);
//        System.out.println(list.size());
//        System.out.println(list);
//
//        list.remove(1);
//        System.out.println(list);
//
//        list.remove(new Board("제목3", "내용3", "작성자3"));
//        System.out.println(list);
//
//        list.remove(board);
//        System.out.println(list);
//
//        list.clear();
//        System.out.println(list.size());
//        System.out.println(list);

        {
            list.add(new Board("제목1", "내용1", "작성자1"));
            list.add(new Board("제목2", "내용2", "작성자2"));
            list.add(new Board("제목3", "내용3", "작성자3"));
            list.add(new Board("제목4", "내용4", "작성자4"));
            list.add(new Board("제목4", "내용4", "작성자4"));

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

            for (Board board : list) {
                System.out.println(board);
            }

            Iterator<Board> itr = list.iterator();
            while (itr.hasNext()) {
                Board board = itr.next();
                System.out.println(board);
            }
        }


    }
}
