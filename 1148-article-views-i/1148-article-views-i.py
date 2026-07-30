import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    # 1. Filter rows where author_id equals viewer_id
    filtered = views[views['author_id'] == views['viewer_id']]
    
    # 2. Extract unique author IDs and sort them
    unique_authors = filtered['author_id'].drop_duplicates().sort_values()
    
    # 3. Format as DataFrame with column name 'id'
    return pd.DataFrame({'id': unique_authors})