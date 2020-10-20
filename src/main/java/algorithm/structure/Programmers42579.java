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
    class Album implements Comparable<Album> {
        int code;
        int plays;

        Album(int code, int plays, String genre) {
            this.code = code;
            this.plays = plays;
        }

        @Override
        public int compareTo(Album o) {
            return this.plays - o.plays;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Integer> playTime = new HashMap<>();
        Map<String, PriorityQueue<Album>> bestAlbum = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            Album newAlbum = new Album(i, plays[i], genres[i]);
            PriorityQueue<Album> list = bestAlbum.getOrDefault(genres[i], new PriorityQueue<>(Collections.reverseOrder()));
            list.add(newAlbum);
            bestAlbum.put(genres[i], list);
            playTime.put(genres[i], playTime.getOrDefault(genres[i], 0) + plays[i]);
        }
        //playTime을 정렬하고, 그 순서대로 bestAlbum에서 꺼내서 출력하기.
        playTime.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .forEach(entry -> {
                    PriorityQueue<Album> list = bestAlbum.get(entry.getKey());
                    if (list.size() >= 2) {
                        answer.add(list.poll().code);
                        answer.add(list.poll().code);
                    } else {
                        answer.add(list.poll().code);
                    }
                });

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
