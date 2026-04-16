import java.util.Scanner;

public class MusicPlaylist {
    private class Node {
        String title;
        Node next, prev;
        Node(String t) { title = t; }
    }
    
    private Node current;
    
    public void add(String title) {
        Node n = new Node(title);
        if (current == null) {
            n.next = n.prev = n;
            current = n;
        } else {
            Node head = current, tail = head.prev;
            tail.next = n; n.prev = tail;
            n.next = head; head.prev = n;
        }
        System.out.println("Added: " + title);
    }

    public void remove(String title) {
        if (current == null) return;
        Node temp = current;
        do {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.next == temp) {
                    current = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    if (temp == current) current = temp.next;
                }
                System.out.println("Removed: " + title);
                return;
            }
            temp = temp.next;
        } while (temp != current);
        System.out.println("Song not found.");
    }

    public void move(boolean forward) {
        if (current != null) {
            current = forward ? current.next : current.prev;
            System.out.println("Now Playing: " + current.title);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void display() {
        if (current == null) { System.out.println("Playlist is Empty."); return; }
        Node temp = current;
        System.out.print("Playlist: ");
        do {
            System.out.print(temp.title + (temp == current ? "[Active] " : " "));
            temp = temp.next;
        } while (temp != current);
        System.out.println("(Loop)");
    }

    public static void main(String[] args) {
        MusicPlaylist myPlaylist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("--- Music Player Menu ---");
        System.out.println("Commands: add [name], remove [name], next, prev, list, exit");

        while (true) {
            System.out.print("\nEnter command: ");
            command = scanner.nextLine().toLowerCase();

            if (command.startsWith("add ")) {
                myPlaylist.add(command.substring(4));
            } else if (command.startsWith("remove ")) {
                myPlaylist.remove(command.substring(7));
            } else if (command.equals("next")) {
                myPlaylist.move(true);
            } else if (command.equals("prev")) {
                myPlaylist.move(false);
            } else if (command.equals("list")) {
                myPlaylist.display();
            } else if (command.equals("exit")) {
                System.out.println("Closing Player...");
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}
