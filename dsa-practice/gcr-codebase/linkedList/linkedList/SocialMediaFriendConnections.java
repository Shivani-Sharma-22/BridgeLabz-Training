// Friend Linked List Node
package linkedList;

class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

// User Linked List Node
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

// Social Media System
class SocialMedia {
    private UserNode head;

    // Add User
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    private UserNode findUser(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bidirectional)
    public void addFriend(int id1, int id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        u1.friends = addFriendNode(u1.friends, id2);
        u2.friends = addFriendNode(u2.friends, id1);
    }

    private FriendNode addFriendNode(FriendNode head, int id) {
        FriendNode newNode = new FriendNode(id);
        newNode.next = head;
        return newNode;
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        u1.friends = removeFriendNode(u1.friends, id2);
        u2.friends = removeFriendNode(u2.friends, id1);
    }

    private FriendNode removeFriendNode(FriendNode head, int id) {
        if (head == null) return null;

        if (head.friendId == id)
            return head.next;

        FriendNode prev = head;
        FriendNode curr = head.next;

        while (curr != null) {
            if (curr.friendId == id) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUser(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUser(id1);
        UserNode u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Search user by name or ID
    public void searchUser(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: " + temp.userId + " " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    public void searchUser(int id) {
        UserNode user = findUser(id);
        if (user != null)
            System.out.println("User Found: " + user.name);
        else
            System.out.println("User not found.");
    }

    // Count friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
}

// Main Class
public class SocialMediaFriendConnections {
    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Shivani", 22);
        sm.addUser(2, "Aman", 23);
        sm.addUser(3, "Riya", 21);
        sm.addUser(4, "Neha", 24);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);
        sm.searchUser("Riya");
        sm.countFriends();

        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}
