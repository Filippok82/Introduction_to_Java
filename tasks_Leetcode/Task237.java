package tasks_Leetcode;

    
    class LinkedList {
        Node head; //голова списка

        /* Узел связанного списка */
        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        /*
         * Заданный ключ удаляет первый
         * появление ключа в
         * связанном списке
         */
        void deleteNode(int key) {
            // Головной узел хранилища
            Node temp = head, prev = null;

           // Если сам головной узел содержит ключ, подлежащий удалению
            if (temp != null && temp.data == key) {
                head = temp.next; //Замена головы
                return;
            }

           // Поиск ключа для удаления, отслеживание
        // предыдущего узла, так как нам нужно изменить temp.next
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            // Если ключ отсутствовал в связанном списке
            if (temp == null)
                return;

            // Отсоединить узел от связанного списка
            prev.next = temp.next;
        }

 /* Вставляет новый узел в начало списка. */
        public void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        /*
         *Распечатка списка
         */
        public void printList() {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }

        
        public static void main(String[] args) {

            LinkedList llist = new LinkedList();

            llist.push(7);
            llist.push(1);
            llist.push(3);
            llist.push(2);

            System.out.println("Созданный связаныйсписок:");
            llist.printList();

            llist.deleteNode(1); // Удалить узел с данными 1

            System.out.println("\nСвязанный список после удаления 1:");
            llist.printList();
        }
    }


