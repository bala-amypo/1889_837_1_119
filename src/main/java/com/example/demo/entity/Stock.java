@Entity
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String ticker;

    private String companyName;
    private String sector;
    private Boolean isActive;

    public Stock() {}

    public Stock(String ticker, String companyName, String sector, Boolean isActive) {
        this.ticker = ticker;
        this.companyName = companyName;
        this.sector = sector;
        this.isActive = isActive;
    }
}
