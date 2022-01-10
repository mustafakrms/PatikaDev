# Proje 1
---
### [22,27,16,2,18,6] -> insertion sort

* Yukarıda Verilen dizinin sort türüne göre aşamalarını yazınız.

```
[22,27,16,2,18,6]
[2,27,16,22,18,6]
[2,6,16,22,18,27]
[2,6,16,18,22,27]
```

* Big-o gösterimini yapınız.

```
O(n^2)
```
* Time Complexity:
    1) **Average case** : Aradığımız sayının ortada olması.
    ```
    [2,6,16,18,22,27] = 16 - 18
    ```
    2) **Worst case** : Aradığımız sayının sonda olması.
    ```
    [2,6,16,18,22,27] = 27
    ```
    3) **Best case** : Aradığımız sayının dizinin en başında olması.
    ```
    [2,6,16,18,22,27] = 2
    ```

* Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer?

```
Avarage case
```
---

### [7,3,5,8,2,9,4,15,6]
* Dizisinin insertion sort'a göre ilk 4 adımını yazınız.

```
[7,3,5,8,2,9,4,15,6]
[2,3,5,8,7,9,4,15,6]
[2,3,4,8,7,9,5,15,6]
[2,3,4,5,7,9,8,15,6]
```







