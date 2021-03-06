package com.golden.request;

import java.util.List;

public class InvoiceRed {
    private List<InvoiceRedInvoice> invoices;

    @ApiField(name="invoices")
    public List<InvoiceRedInvoice> getInvoices() {
        return invoices;
    }

    public InvoiceRed setInvoices(List<InvoiceRedInvoice> invoice) {
        this.invoices = invoice;
        return this;
    }
}
