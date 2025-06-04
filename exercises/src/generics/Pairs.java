package generics;

import java.util.*;

public class Pairs <K extends Number, V> {

    private final Set<Pair<K, V>> items = new LinkedHashSet<>();

    public void add(K key, V value) {
        if(key == null) return; // ignore null keys and get out of the method

        Pair<K, V> newPair = new Pair<>(key, value);

        // if the key already exists, remove the old pair with the same key
        if(items.contains(newPair)) {
            items.remove(newPair);
        }

        // Then add the new pair. This was to replace the old pair with the same key
        items.add(newPair);
    }

    public V getValue(K key) {
        if(key == null) return null;
        Optional<Pair<K, V>> optionalPair = items.stream()
                .filter(p -> key.equals(p.getKey()))
                .findFirst();

        return optionalPair.isPresent() ? optionalPair.get().getValue() : null;
    }
}
