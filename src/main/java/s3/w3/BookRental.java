package s3.w3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Setter
@Getter
public class BookRental {

    private BookRentalMember member;
    private BookRentalItem item;
    private String startAt;
    private String endAt;

    public float getTotalPrice() {
        LocalDate start = LocalDate.parse(startAt);
        LocalDate end = LocalDate.parse(endAt);
        int duration = end.compareTo(start);
        return item.getPrice() * duration;
    }

}
