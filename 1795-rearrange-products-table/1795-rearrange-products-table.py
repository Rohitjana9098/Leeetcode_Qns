import pandas as pd

def rearrange_products_table(products: pd.DataFrame) -> pd.DataFrame:
    # Unpivot wide table columns (store1, store2, store3) into key-value rows
    df = products.melt(
        id_vars=['product_id'], 
        var_name='store', 
        value_name='price'
    )
    
    # Exclude null values where a product is not available in a store
    return df.dropna(subset=['price'])