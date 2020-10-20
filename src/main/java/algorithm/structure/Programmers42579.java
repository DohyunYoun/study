package algorithm.structure;

import org.jetbrains.annotations.NotNull;

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
    class Album {
        int code;
        int plays;
        int total;
        String genre;

        Album(int code, int plays, String genre) {
            this.code = code;
            this.plays = plays;
            this.genre = genre;
            this.total += plays;
        }

        void setTotal(int total) {
            this.total = total + this.plays;
        }

    }

    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        Map<String, List<Album>> bestAlbum = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            Album newAlbum = new Album(i, plays[i], genres[i]);
            List<Album> list;
            if (bestAlbum.containsKey(genres[i])) {
                list = bestAlbum.get(genres[i]);
                newAlbum.setTotal(list.get(list.size() - 1).total);
            } else {
                list = new ArrayList<>();
            }
//            PriorityQueue<Album> list = bestAlbum.getOrDefault(genres[i], new PriorityQueue<>());
            list.add(newAlbum);
            bestAlbum.put(genres[i], list);
        }
//        PriorityQueue<Album> keys = new PriorityQueue<>(bestAlbum.size(), Collections.reverseOrder());
//        for (List<Album> albums : bestAlbum.values()) {
//            Album album = albums.get(albums.size() - 1);
//            keys.add(album);
////            keys.put(album.genre, album.total);
//        }
        Album[] keys = new Album[bestAlbum.size()];
//        Arrays.sort(keys, ((o1, o2) -> {
//            return Integer.compare(o2.total, o1.total);
//        }));

        Arrays.sort(keys, ((o1, o2) -> Integer.compare(o1.total, o2.total)));



        for (Album key : keys) {
            int i = 2; // maximum
            List<Album> albums = bestAlbum.get(key.genre);
            while (albums.size() != 0 && i != 0) {
                Album a = albums.get(albums.size() - 1);
                answer.add(a.code);
                albums.remove(a);
                i--;
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
