import pandas as pd

def find_products(products: pd.DataFrame) -> pd.DataFrame:
    # Filter rows where both low_fats and recyclable are 'Y'
    mask = (products['low_fats'] == 'Y') & (products['recyclable'] == 'Y')
    
    # Return target product_id column as a DataFrame
    return products[mask][['product_id']]