// O(n^2) kinda cringe but someone made a better solution commented below

import java.util.Map;
import java.util.HashMap;

class HotelRooms {
  public static String mostBookedRoom(String[] rooms) {
    Map<String, Integer> bookage = new HashMap<>();
    for (String room : rooms) {
      if (room.charAt(0) == '+') {
        if (bookage.containsKey(room))
          bookage.put(room, bookage.get(room) + 1);
        else
          bookage.put(room, 0);
      }
    }
    String room = "";
    int max = 0;
    for (String entry : bookage.keySet()) {
      if (max < bookage.get(entry)) {
        room = entry;
        max = bookage.get(entry);
      }
    }

    return room;
  }

  public static void main(String[] args) {
    String[] rooms = { "+1A", "+3E", "-1A", "+4F", "+1A", "-3E" };
    System.out.println(mostBookedRoom(rooms).substring(1));
  }

}

// O(n) solution by charlyz on leetcode
// Wish I was this good :(

// public static String solution(String[] floors)
// {
//   int[] map = new int[260];
//   int max = 0;
//   String currentMax = floors[0];

//   for (int i = 0; i < floors.length; i++) {
//     String currentRoom = floors[i];
//     if (currentRoom.charAt(0) == '-') continue;
//     int idx = (1 + currentRoom.charAt(1) - '0') * (1 + currentRoom.charAt(2) - 'A') - 1;
//     map[idx]++;
//     if (map[idx] > max) {
//       max = map[idx];
//       currentMax = currentRoom;
//     }
//     else if (map[idx] == max) {
//       currentMax = currentMax.compareTo(currentRoom) < 0 ? currentMax : currentRoom;
//     }
//   }
//   return currentMax.substring(1);
// }