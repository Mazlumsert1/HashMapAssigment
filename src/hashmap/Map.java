/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author Tobias
 */
public interface Map<K, V>
{
   V put(K key, V value);
   V get(K key);
   V remove(K key);
   int size();
   default boolean isEmpty()
   {
       return size() == 0;
   }
}
