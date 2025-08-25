package seatWork;

import java.util.List;

public class accountRich {
    private final accountCreation accounts;

    public accountRich(accountCreation accounts) {
        this.accounts = accounts;
    }

    // Print the richest account
    void printRichAccount() {
        mainBank richest = findRichestAccount();
        if (richest == null) {
            System.out.println("No accounts available.");
            return;
        }
        System.out.println("The Richest Account:");
        System.out.printf("Account %d | Balance: %d%n",
                richest.getAccountNo(), richest.getBalance());
    }


    private mainBank findRichestAccount() {
        if (accounts == null) return null;
        List<mainBank> original = accounts.getClientList();
        if (original == null || original.isEmpty()) return null;

        List<mainBank> list = new java.util.ArrayList<>(original);
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getBalance() > list.get(maxIdx).getBalance()) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                mainBank tmp = list.get(i);
                list.set(i, list.get(maxIdx));
                list.set(maxIdx, tmp);
            }
        }
        return list.get(0);
    }
}