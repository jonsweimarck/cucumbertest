package se.bfb.cucumbertest;

import org.springframework.stereotype.Service;

@Service("transferService")
public class TransferService {
    public Receipt transfer(Account source, Account target, Integer amount){

        return new Receipt(source.number, source.balance - amount,
                           target.number, target.balance + amount);
    }
}
