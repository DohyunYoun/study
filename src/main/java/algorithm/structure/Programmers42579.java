package algorithm.structure;

import java.util.*;

/**
 * Created by DohyunYoun on 2020-10-16
 * SITE :
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
//푸는중
public class Programmers42579 {
    class Album implements Comparator<Album> {
        int code;
        int plays;
        int songs;

        Album(int code, int plays) {
            this.code = code;
            this.plays = this.plays+plays;
            songs++;
        }

        @Override
        public int compare(Album o1, Album o2) {
            return Comparator.comparingInt((Album a) -> a.songs).reversed()
                    .thenComparingInt(a -> a.plays).reversed()
                    .thenComparingInt(a -> a.code)
                    .compare(o1, o2);
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = new int[genres.length];


        Map<String, List<Album>> bestAlbum = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            Album newAlbum = new Album(i, plays[i]);
            List<Album> list = bestAlbum.getOrDefault(genres[i], new ArrayList<>());
            list.add(newAlbum);
            bestAlbum.put(genres[i], list);
        }
        int pos = 0;
        for (List<Album> albums : bestAlbum.values()) {
            for (Album album : albums) {
                answer[pos++] = album.code;
            }
        }
        return answer;
    }
}
