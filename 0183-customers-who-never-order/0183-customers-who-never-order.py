import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    # Filter customers whose 'id' is NOT in the 'customerId' column of orders
    df = customers[~customers['id'].isin(orders['customerId'])]
    
    # Select and rename the column as required
    return df[['name']].rename(columns={'name': 'Customers'})