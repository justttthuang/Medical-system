package org.ms.medicalsystem.utils;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@Component
public class ListPageHelper<T> {

    private List<T> list;
    private Integer pageNo;
    private Integer pageSize;
    private Integer starRow;
    private Integer endRow;

    public  ListPageHelper(List<T> list, Integer pageNo, Integer pageSize){
        int size = list.size();
        if(size<=10){
            starRow = 0;
            endRow = size;
        }
        if(size>=10&&pageSize>size){
            starRow = pageNo;
            endRow = size;
        }
        if(size>=10&&pageSize<=size){
            starRow = pageNo;
            endRow = pageSize;
        }
    }

}
