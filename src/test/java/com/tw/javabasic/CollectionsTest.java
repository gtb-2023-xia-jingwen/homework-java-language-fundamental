package com.tw.javabasic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

class CollectionsTest {
    @Test
    void should_turn_collections_to_arrays() {
        Collection<String> arrayCollection = new LinkedList<>();

        arrayCollection.add("Amy");
        arrayCollection.add("Bob");
        arrayCollection.add("Carl");

        String[] array = null;
        // TODO: Please turn array collection into string arrays.
        //
        // Hint:
        //  If you meet difficulties, please refer to https://www.baeldung.com/java-collection-toarray-methods.
        // <-start-

        array = arrayCollection.toArray(new String[]{});

        // --end-->

        assertArrayEquals(new String[] {"Amy", "Bob", "Carl"}, array);
    }

    @Test
    void should_remove_duplication_from_a_list() {
        List<String> listWithDuplication = Arrays.asList(
            "tiger", "monkey", "tiger", "panda", "monkey");
        List<String> withoutDuplication = null;

        // TODO: Remove duplications in `listWithDuplication` and please reserve the
        //   original order. You should not use Streaming API.
        //
        // Hint:
        //  If you meet difficulties, please refer to "Core Java Vol 1", section 9.1.3.
        // <-start-

        HashSet<String> existItems = new HashSet<>();
        withoutDuplication = new ArrayList<>();
        for (String item : listWithDuplication) {
            if (existItems.contains(item)) continue;
            existItems.add(item);
            withoutDuplication.add(item);
        }

        // --end->

        assertIterableEquals(Arrays.asList("tiger", "monkey", "panda"), withoutDuplication);
    }

    @Test
    void should_iterate_over_an_iterable() {
        final Iterator<String> iterator = Arrays.asList("tiger", "monkey", "panda").iterator();
        final List<String> cloned = new ArrayList<>();

        // TODO: Please iterate over the `iterable` and turn them into upper-case
        //   words. You should not use Streaming API.
        // <-start-

        while (iterator.hasNext()) {
            cloned.add(iterator.next().toUpperCase());
        }

        // --end-->

        assertIterableEquals(
            Arrays.asList("TIGER", "MONKEY", "PANDA"),
            cloned);
    }

    @Test
    void should_sum_up_all_the_numbers() {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = 0;

        // TODO: sum all the numbers. You should not use Streaming API.
        // <-start-

        for(int num : numbers) sum += num;

        // --end->

        assertEquals(55, sum);
    }

    @Test
    void should_sort_collection_in_place() {
        List<Integer> numbers = Arrays.asList(1, 6, 2, 4, 33, 76, 8, 9);

        // TODO: Please sort the list in-place. You should use existed method to
        //   do sorting work. You should not use Streaming API.
        //
        // Hint:
        //  If you meet difficulties, please refer to https://www.baeldung.com/java-sorting.
        // <-start-

        Collections.sort(numbers);

        // --end-->

        assertEquals(Arrays.asList(1, 2, 4, 6, 8, 9, 33, 76), numbers);
    }

    @Test
    void should_create_sorted_collection() {
        final List<Integer> unsorted = Arrays.asList(1, 6, 2, 4, 33, 76, 8, 9);
        List<Integer> sorted = null;

        // TODO: Please create new sorted list. You should use existed method to
        //   do sorting work. You should not use Streaming API.
        // <-start-

        sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted);

        // --end-->

        assertEquals(Arrays.asList(1, 6, 2, 4, 33, 76, 8, 9), unsorted);
        assertEquals(Arrays.asList(1, 2, 4, 6, 8, 9, 33, 76), sorted);
    }

    @Test
    void should_creating_a_histogram() {
        String text =
            "A panda walks into a cafe. He orders a sandwich, eats it, then " +
            "draws a gun and fires two shots in the air." +
            "\"Why?\" asks the confused waiter, as the panda makes towards the exit." +
            "The panda produces a badly punctuated wildlife manual and tosses it over" +
            "his shoulder. \"I'm a panda,\" he says, at the door." +
            "\"Look it up.\" The waiter turns to the relevant entry and, sure enough, " +
            "finds an explanation..." +
            "\"Panda. Large black-and-white bear-like mammal, native to China. Eats, " +
            "shoots and leaves.\"";
        Map<Character, Integer> histogram = new HashMap<>();

        // TODO: create a histogram with statistics of all occurrence of English letters
        //   case insensitive. You should not using Streaming API.
        // Hint
        // 1.Every letter is alphabetic, but not every alphabetic is a letter.
        // 2.In Java 7 (which users unicode 6.0.0), there are 824 characters
        // in the BMP which are alphabetic but not letters.
        // 3.For English text, the distinction makes no difference.
        // 4.If one has a choice, the best answer may be isLetter().
        // 5.For example, isAlphabetic('\u2165') = true, isLetter('\u2165') = false (\u2165 => VI )
        // https://juejin.cn/post/6844903446349512712#heading-5
        // <-start-

        for(Character ch : text.toCharArray()) {
            if (!Character.isLetter(ch)) continue;
            char k = Character.toLowerCase(ch);
            histogram.put(k, histogram.getOrDefault(k, 0) + 1);
        }
        for (char k = 'a'; k <= 'z'; k++) {
            if (!histogram.containsKey(k)) histogram.put(k, 0);
        }

        // --end->

        assertEquals(26, histogram.size());
        assertEquals(52, histogram.get('a'));
        assertEquals(3, histogram.get('b'));
        assertEquals(7, histogram.get('c'));
        assertEquals(22, histogram.get('d'));
        assertEquals(40, histogram.get('e'));
        assertEquals(5, histogram.get('f'));
        assertEquals(3, histogram.get('g'));
        assertEquals(20, histogram.get('h'));
        assertEquals(21, histogram.get('i'));
        assertEquals(0, histogram.get('j'));
        assertEquals(6, histogram.get('k'));
        assertEquals(14, histogram.get('l'));
        assertEquals(6, histogram.get('m'));
        assertEquals(28, histogram.get('n'));
        assertEquals(20, histogram.get('o'));
        assertEquals(9, histogram.get('p'));
        assertEquals(0, histogram.get('q'));
        assertEquals(18, histogram.get('r'));
        assertEquals(29, histogram.get('s'));
        assertEquals(34, histogram.get('t'));
        assertEquals(11, histogram.get('u'));
        assertEquals(4, histogram.get('v'));
        assertEquals(10, histogram.get('w'));
        assertEquals(2, histogram.get('x'));
        assertEquals(4, histogram.get('y'));
        assertEquals(0, histogram.get('z'));
    }
}
