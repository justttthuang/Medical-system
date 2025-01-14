package org.ms.medicalsystem.utils;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class PageHelper {

    private Integer pageNo;
    private Integer startRow;
    private Integer endRow;

    public PageHelper(Integer pageNo) {
        int startRow,endRow;
        if(pageNo==1)
            startRow = 0;
        else {
            startRow = (pageNo-1)*10;
        }
        endRow = (pageNo*10);
        this.pageNo = pageNo;
        this.startRow = startRow;
        this.endRow = endRow;
    }
}
