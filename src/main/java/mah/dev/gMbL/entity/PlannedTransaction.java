package mah.dev.gMbL.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "planned_transaction")
public class PlannedTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "id_factor")
    private Factor factor;

    @Column(name = "amount")
    private double amount;

    @Column(name = "type")
    private String type;

    @Column(name = "date")
    private Date date;

    @Column(name = "description")
    private String description;
}
