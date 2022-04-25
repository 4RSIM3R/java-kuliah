package s2.w3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Land implements Comparable<Land> {

    private int length;
    private int width;
    private int wide;


    @Override
    public int compareTo(Land o) {
        return o.getWide();
    }
}
