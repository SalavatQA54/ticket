import org.example.Ticket;
import org.example.TicketManager;
import org.example.TicketRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicketManagerTest {
    @Test
    public void testSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(1, "MSK", "KZN", 200, 63);
        Ticket ticket2 = new Ticket(2, "MSK", "KZN", 100, 68);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "KZN", 400, 163);
        Ticket ticket5 = new Ticket(5, "UFA", "KZN", 700, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "KZN", 200, 163);
        Ticket ticket7 = new Ticket(7, "UFA", "LA", 300, 263);
        Ticket ticket8 = new Ticket(8, "MSK", "KZN", 500, 63);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};
        Ticket[] actual = manager.findAll("MSK", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testOneOffers() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);

        Ticket ticket1 = new Ticket(1, "MSK", "KZN", 200, 63);
        Ticket ticket2 = new Ticket(2, "MSK", "KZN", 100, 68);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "KZN", 400, 163);
        Ticket ticket5 = new Ticket(5, "UFA", "KZN", 700, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "KZN", 200, 163);
        Ticket ticket7 = new Ticket(7, "UFA", "LA", 300, 263);
        Ticket ticket8 = new Ticket(8, "MSK", "KZN", 500, 63);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.findAll("UFA", "LA");
        Ticket[] expected = {ticket7};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testNoOffers() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);

        Ticket ticket1 = new Ticket(1, "MSK", "KZN", 200, 63);
        Ticket ticket2 = new Ticket(2, "MSK", "KZN", 100, 68);
        Ticket ticket3 = new Ticket(3, "MSK", "UFA", 200, 186);
        Ticket ticket4 = new Ticket(4, "MSK", "KZN", 400, 163);
        Ticket ticket5 = new Ticket(5, "UFA", "KZN", 700, 222);
        Ticket ticket6 = new Ticket(6, "MSK", "KZN", 200, 163);
        Ticket ticket7 = new Ticket(7, "UFA", "LA", 300, 263);
        Ticket ticket8 = new Ticket(8, "MSK", "KZN", 500, 63);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.findAll("KZN", "LA");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);

        Ticket ticket1 = new Ticket(1, "KZN", "KJA", 99, 350);
        Ticket ticket2 = new Ticket(2, "KZN", "KJA", 110, 400);
        Ticket ticket3 = new Ticket(3, "KZN", "KJA", 120, 420);
        Ticket ticket4 = new Ticket(4, "KZN", "KJA", 130, 150);
        Ticket ticket5 = new Ticket(5, "KZN", "KJA", 140, 120);
        Ticket ticket6 = new Ticket(6, "KZN", "KJA", 150, 160);
        Ticket ticket7 = new Ticket(7, "KZN", "KJA", 160, 250);
        Ticket ticket8 = new Ticket(8, "KZN", "KJA", 170, 230);
        Ticket ticket9 = new Ticket(9, "KZN", "KJA", 175, 300);
        Ticket ticket10 = new Ticket(10, "KZN", "KJA", 180, 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.findAll("KZN", "KJA");
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9, ticket10};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPricesAreTheSame() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);

        Ticket ticket1 = new Ticket(1, "KZN", "KJA", 300, 350);
        Ticket ticket2 = new Ticket(2, "KZN", "NBC", 290, 400);
        Ticket ticket3 = new Ticket(3, "LPK", "NOZ", 50, 420);
        Ticket ticket4 = new Ticket(4, "GDX", "OMS", 190, 150);
        Ticket ticket5 = new Ticket(5, "KZN", "KJA", 150, 120);
        Ticket ticket6 = new Ticket(6, "SPB", "VKO", 210, 160);
        Ticket ticket7 = new Ticket(7, "KZN", "KJA", 150, 250);
        Ticket ticket8 = new Ticket(8, "LPK", "ARH", 250, 230);
        Ticket ticket9 = new Ticket(9, "KZN", "KJA", 175, 300);
        Ticket ticket10 = new Ticket(10, "ZIA", "INA", 110, 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.findAll("KZN", "KJA");
        Ticket[] expected = {ticket5, ticket7, ticket9, ticket1};

        Assertions.assertArrayEquals(expected, actual);

    }
}

