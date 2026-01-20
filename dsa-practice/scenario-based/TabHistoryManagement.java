import java.util.*;
class Page {
    String url;
    Page prev, next;

    Page(String url) { 
    	this.url = url; 
    }
}

class TabHistory {
    Page current;

    void visit(String url) {
        Page newPage = new Page(url);
        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }
        current = newPage;
    }

    void back() {
        if (current != null && current.prev != null) current = current.prev;
    }

    void forward() {
        if (current != null && current.next != null) current = current.next;
    }

    void showCurrent() {
        System.out.println("Current page: " + (current != null ? current.url : "None"));
    }
}

public class TabHistoryManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        TabHistory currentTab = new TabHistory();
        Stack<TabHistory> closedTabs = new Stack<>();

        while (true) {
            System.out.println("\n--- Browser Buddy ---");
            System.out.println("1. Visit new page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show current page");
            System.out.println("5. Close tab");
            System.out.println("6. Reopen last closed tab");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    currentTab.visit(url);
                    break;

                case 2:
                    currentTab.back();
                    break;

                case 3:
                    currentTab.forward();
                    break;

                case 4:
                    currentTab.showCurrent();
                    break;

                case 5:
                    closedTabs.push(currentTab);
                    currentTab = new TabHistory();
                    System.out.println("Tab closed");
                    break;

                case 6:
                    if (!closedTabs.isEmpty()) {
                        currentTab = closedTabs.pop();
                        System.out.println("Tab reopened");
                        currentTab.showCurrent();
                    } else {
                        System.out.println("No closed tabs to reopen");
                    }
                    break;

                case 7:
                    System.out.println("Browser closed");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
}
}
