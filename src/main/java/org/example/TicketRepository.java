package org.example;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];

    public Ticket[] findAll() {
        return tickets;
    }

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Ticket[] getAll () {
        return tickets;
    }
    public void removeTicket(int id) {
        int index = 0;
        Ticket[] tmp = new Ticket[tickets.length - 1];
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }

        }
        tickets = tmp;
    }
}
